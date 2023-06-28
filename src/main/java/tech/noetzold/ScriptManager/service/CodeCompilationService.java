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

    public String compileCode(String lang, String code) {
        CompileRequest compileRequest = new CompileRequest();
        compileRequest.setSource(code);
        compileRequest.setLang(lang);

        String apiKey = "cdd1b13d25456b4c72a2ef03c5b2e8643527f5a9";

        return hackerEarthClient.compileCode(apiKey, compileRequest);
    }
}
