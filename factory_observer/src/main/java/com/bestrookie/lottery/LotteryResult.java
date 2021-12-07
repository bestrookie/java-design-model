package com.bestrookie.lottery;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/12/5 17:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {
    private String uId;
    private String msg;
    private Date dateTime;
}
