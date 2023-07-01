package tech.noetzold.ScriptManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.noetzold.ScriptManager.model.CompileRequest;
import tech.noetzold.ScriptManager.repository.CompileRepository;

import java.util.List;
import java.util.Optional;

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

    public List<CompileRequest> getAllScripts(){
        return compileRepository.findAll();
    }

    public CompileRequest getScriptById(Long id){
        return compileRepository.findById(id).orElse(null);
    }

    public void removeSriptById(Long id){
        compileRepository.deleteById(id);
    }

    public CompileRequest updateScript(CompileRequest compileRequest){
        Optional<CompileRequest> compileRequestExist = compileRepository.findById(compileRequest.getId());
        if (compileRequestExist.isEmpty()) {
            throw new RuntimeException("Entidade não encontrada");
        }

        CompileRequest compileRequestUpdate= compileRequestExist.get();
        compileRequestUpdate.setLang(compileRequest.getLang());
        compileRequestUpdate.setSource(compileRequest.getSource());


        return compileRepository.save(compileRequestUpdate);
    }

}
