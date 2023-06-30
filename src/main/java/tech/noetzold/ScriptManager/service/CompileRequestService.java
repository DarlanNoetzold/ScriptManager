package tech.noetzold.ScriptManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.noetzold.ScriptManager.model.CompileRequest;
import tech.noetzold.ScriptManager.repository.CompileRepository;

@Service
public class CompileRequestService {

    @Autowired
    private CompileRepository compileRepository;

    public CompileRequest addNewScript(String lang, String code){
        CompileRequest compileRequest = new CompileRequest();
        compileRequest.setSource(code);
        compileRequest.setLang(lang);

        return compileRepository.save(compileRequest);
    }

}
