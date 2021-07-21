package com.dom.mdwapp.controller;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dom.mdwapp.model.TransferGetResponse;
import com.dom.mdwapp.model.TransferRequest;
import com.dom.mdwapp.model.TransferResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class MdwController {

	@PostMapping("/transfer")
	public TransferResponse transfer(@Valid @RequestBody TransferRequest req) {
		final String uri = "http://demo4849241.mockable.io/transfer";

		ObjectMapper objectMapper = new ObjectMapper();

		JSONObject bReq = new JSONObject();
		bReq.put("from_acct", req.getFromAccount());
		bReq.put("to_acct", req.getToAccount());
		bReq.put("amt", req.getAmount());
		
		TransferResponse resp = new TransferResponse();

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.postForObject(uri, bReq, String.class);
		try {
			JsonNode jsonNode = objectMapper.readTree(result);
			String code = jsonNode.path("code").asText("99");
			String message = jsonNode.path("message").asText("ERROR from backend");			
			
			resp.setStatusCode(code);
			resp.setStatusMessage(message);
			resp.setTransactionId(req.getTransactionId());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return resp;
	}
	
    @GetMapping("/transfer/{id}")
    public TransferGetResponse getUsersById(@PathVariable(value = "id") Long transactionId) {
    	final String uri = "http://demo4849241.mockable.io/transfer";
    	ObjectMapper objectMapper = new ObjectMapper();
    	TransferGetResponse resp = new TransferGetResponse();
    	RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		try {
			JsonNode jsonNode = objectMapper.readTree(result);
			String fromAccount = jsonNode.path("from_acct").asText("");
			String toAccount = jsonNode.path("to_acct").asText("");		
			String amount = jsonNode.path("amt").asText("");	
			
			resp.setFromAccount(fromAccount);
			resp.setToAccount(toAccount);
			resp.setAmount(amount);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resp;
    }

}
