package com.bestrookie.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/30 21:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigFile {
    private String versionNo;
    private String content;
    private Date dateTime;
    private String operator;
}
