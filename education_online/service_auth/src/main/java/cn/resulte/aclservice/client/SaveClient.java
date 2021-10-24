package cn.resulte.aclservice.client;

import cn.resulte.aclservice.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "service-save", fallback = SaveCallbackClient.class)
public interface SaveClient {
    @GetMapping("/saveservice/video/save/{token}")
    public void saveToken(@PathVariable("token") String token);
}
