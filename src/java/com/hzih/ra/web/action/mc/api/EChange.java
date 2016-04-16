package com.hzih.ra.web.action.mc.api;

import com.inetec.common.exception.ErrorCode;
import com.inetec.common.i18n.Key;


/**
 * 平台的异常编码类。
 *
 * @author inetec System
 * @version 1.0
 */
public class EChange extends ErrorCode {

    public static final int I_NOERROR = 0;
    public static final Key K_NOERROR = new Key("NO ERROR.");
    public static final EChange E_NOERROR = new EChange(I_NOERROR);

    /**
     * 不知道的错误编码
     */
    public static final int I_UNKNOWN = -1;
    public static final Key K_UNKNOWN = new Key("UNKNOWN");
    public static final EChange E_UNKNOWN = new EChange(I_UNKNOWN);
    /**
     * 没有实现的错误编码
     */
    public static final int I_NOTIMPLEMENTED = -6;
    public static final Key K_NOTIMPLEMENTED = new Key("NOT IMPLEMENTED");
    public static final EChange E_NOTIMPLEMENTED = new EChange(I_NOTIMPLEMENTED);

    // General errors: 10010
    /**
     * 字符串为空的错误编码。
     */
    public static final int I_GE_NullString = 10011;
    public static final Key K_Ge_NullString = new Key("Get String is Null");
    public static final EChange E_Ge_NullString = new EChange(I_GE_NullString);
    /**
     * 索引超界的错误编码。
     */
    public static final int I_GE_IndexOutOfRange = 10012;
    public static final Key K_GE_IndexOutOfRange = new Key("Get String Inddex Out of Range.");
    public static final EChange E_Ge_IndexOutOfRange = new EChange(I_GE_IndexOutOfRange);

    // NodeInfo: 10020

    /**
     * 已经配置过的错误编码。
     */
    public static final int I_CF_AlreadyConfigured = 10035;
    public static final Key K_CF_AlreadyConfigured = new Key("Already Configured.");
    public static final EChange E_CF_AlreadyConfigured = new EChange(I_CF_AlreadyConfigured);
    /**
     * 配置不成功的错误编码。
     */
    public static final int I_CF_Failed = 10036;
    public static final Key K_CF_Failed = new Key("Config faild.");
    public static final EChange E_CF_Faild = new EChange(I_CF_Failed);

    /**
     * 配置变量无效的错误编码。
     */
    public static final int I_CF_VariableNotFound = 10037;
    public static final Key K_CF_VariableNotFound = new Key("Config Variable Not Found");
    public static final EChange E_CF_VariableNotFound = new EChange(I_CF_VariableNotFound);
    /**
     * 配置数据为空的错误编码。
     */
    public static final int I_CF_NullConfigData = 10038;
    public static final Key K_CF_NullConfigData = new Key("Config data is null.");
    public static final EChange E_CF_NullConfigData = new EChange(I_CF_NullConfigData);
    /**
     * 没有实现配置接口的错误编码
     */
    public static final int I_CF_InterfaceNotImplemented = 10039;
    public static final Key K_CF_InterfaceNotImplemented = new Key("Interfac not implemented.");
    public static final EChange E_CF_InterfaceNotImplemented = new EChange(I_CF_InterfaceNotImplemented);
    /*
    * 没有配置过的错误编码
    */
    public static final int I_CF_NotConfigured = 10040;
    public static final Key K_CF_NotConfigured = new Key("Not Configured.");
    public static final EChange E_CF_NotConfigured = new EChange(I_CF_NotConfigured);
    /**
     * 数据库错误编码
     */
    public static final int I_DATABASEERROR = -2;
    public static final Key K_DATABASEERROR = new Key("Database Error.");
    public static final EChange E_DATABASEERROR = new EChange(I_DATABASEERROR);
    /**
     * 数据库连接错误编码
     */
    public static final int I_DATABASECONNECTIONERROR = -3;
    public static final Key K_DATABASECONNECTIONERROR = new Key("Database Connector Error.");
    public static final EChange E_DATABASECONNECTIONERROR = new EChange(I_DATABASECONNECTIONERROR);


    public static final int I_NetWorkError = -10012;
    public static final Key K_NetWorkError = new Key("Network Error.");
    public static final EChange E_NetWorkError = new EChange(I_NetWorkError);

    public static final int I_TargetProcessError = -10013;
    public static final Key K_TargetProcessError = new Key("Target process Error.");
    public static final EChange E_TargetProcessError = new EChange(I_TargetProcessError);
    public static final int I_DataIsNullError = -10014;
    public static final Key K_DataIsNullError = new Key("Data Is Null.");
    public static final EChange E_DataIsNullErrorr = new EChange(I_DataIsNullError);
    public static final int I_DataLengthError = -10015;
    public static final Key K_DataLengthError = new Key("Data Length error.");
    public static final EChange E_DataLengthError = new EChange(I_DataIsNullError);

    private EChange(int i) {
        super(i);
    }

}
