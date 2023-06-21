package tech.noetzold.ScriptManager.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import tech.noetzold.ScriptManager.model.CompileRequest;

@FeignClient(name = "hackerEarthClient", url = "https://api.hackerearth.com/v3/code/compile/")
public interface HackerEarthClient {

    @PostMapping
    String compileCode(@RequestHeader("Authorization") String apiKey, @RequestBody CompileRequest compileRequest);
}
