package com.cnu.real_coding_server.service.valid;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostValidService {
    public boolean isSlangInclude(List<String> slangList,
                               String title,
                               String postContent) {
        for (String slang : slangList) {
            if(title.contains(slang)
                    || postContent.contains(slang)) {
                return true;
            }
        }
        return false;
    }
    public boolean isSlangIncludeTitle(List<String> slangList,
                                       String title) {
        for (String slang : slangList) {
            if(title.contains(slang)
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean isSlangIncludeContent(List<String> slangList,
                                         String postContent) {
        for (String slang : slangList) {
            if(postContent.contains(slang)) {
                return true;
            }
        }
        return false;
    }
}
