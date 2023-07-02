package tech.noetzold.ScriptManager.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import tech.noetzold.ScriptManager.model.CompileRequest;

@Service
@FeignClient(name = "hackerEarthClient", url = "https://api.hackerearth.com/v4/partner/code-evaluation/submissions/")
public interface HackerEarthClient {

    @PostMapping
    String compileCode(@RequestHeader("client-secret") String apiKey, @RequestBody CompileRequest compileRequest);
}
