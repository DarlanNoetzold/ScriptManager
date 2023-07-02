package tech.noetzold.ScriptManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.noetzold.ScriptManager.client.HackerEarthClient;
import tech.noetzold.ScriptManager.model.CompileRequest;
import tech.noetzold.ScriptManager.repository.CompileRepository;

import java.util.List;

@Service
public class CodeCompilationService {
    @Autowired
    private CompileRepository compileRepository;

    @Autowired
    HackerEarthClient hackerEarthClient;

    public String compileCode(Long id) {
        CompileRequest compileRequest = compileRepository.findById(id).get();

        if(compileRequest == null)
            return "There are no script with id " + id;

        String apiKey = "cdd1b13d25456b4c72a2ef03c5b2e8643527f5a9";

        return hackerEarthClient.compileCode(apiKey, compileRequest);
    }

    public List<CompileRequest> showScripts(){
        return compileRepository.findAll();
    }
}
