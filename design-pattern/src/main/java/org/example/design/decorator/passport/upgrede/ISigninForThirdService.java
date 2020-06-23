package org.example.design.decorator.passport.upgrede;

import org.example.design.adapter.loginadapter.ResultMsg;
import org.example.design.decorator.passport.old.ISigninService;

/**
 * Created by Tom on 2018/3/17.
 */
public interface ISigninForThirdService extends ISigninService {


    public org.example.design.decorator.passport.old.ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public org.example.design.decorator.passport.old.ResultMsg loginForRegist(String username, String password);


}
