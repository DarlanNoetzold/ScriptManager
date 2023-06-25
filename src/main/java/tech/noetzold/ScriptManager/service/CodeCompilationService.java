package tech.noetzold.ScriptManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.noetzold.ScriptManager.client.HackerEarthClient;
import tech.noetzold.ScriptManager.model.CompileRequest;

@Service
public class CodeCompilationService {
    private final HackerEarthClient hackerEarthClient;

    @Autowired
    public CodeCompilationService(HackerEarthClient hackerEarthClient) {
        this.hackerEarthClient = hackerEarthClient;
    }

    public String compileCode(String code) {
        CompileRequest compileRequest = new CompileRequest();
        compileRequest.setSource(code);
        compileRequest.setLang("java");

        String apiKey = "API_KEY_AQUI";

        return hackerEarthClient.compileCode(apiKey, compileRequest);
    }
}
