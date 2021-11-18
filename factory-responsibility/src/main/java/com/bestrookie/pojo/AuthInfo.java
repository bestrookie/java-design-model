package com.bestrookie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/11/18 10:12 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthInfo {
    private String code;
    private String info = "";
    public AuthInfo(String code,String ...infos){
        this.code = code;
        for (String info : infos) {
            this.info = this.info.concat(info);
        }
    }
}
