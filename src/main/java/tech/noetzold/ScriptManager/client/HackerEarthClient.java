package tech.noetzold.ScriptManager.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tech.noetzold.ScriptManager.model.CompileRequest;

@Service
@FeignClient(name = "hackerEarthClient", url = "https://api.hackerearth.com/v4/partner")
public interface HackerEarthClient {

    @PostMapping("/code-evaluation/submissions")
    String compileCode(@RequestHeader("client-secret") String apiKey, @RequestBody CompileRequest compileRequest);

    @GetMapping("/code-evaluation/submissions/{id}")
    String resultCompileCode(@RequestHeader("client-secret") String apiKey, @PathVariable("id") String id);
}
