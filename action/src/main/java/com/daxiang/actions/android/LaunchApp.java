package com.daxiang.actions.android;

import com.daxiang.actions.utils.AndroidUtil;
import com.daxiang.actions.utils.MacacaUtil;
import macaca.client.MacacaClient;

import java.io.IOException;

/**
 * Created by jiangyitao.
 */
public class LaunchApp  {

    private MacacaClient macacaClient;

    public LaunchApp(MacacaClient macacaClient) {
        this.macacaClient = macacaClient;
    }

    /**
     * 启动APP
     * @param packageName
     * @param launchActivity
     * @throws IOException
     */
    public void excute(String packageName,String launchActivity) throws IOException {
        String deviceId = MacacaUtil.getDeviceId(macacaClient);
        AndroidUtil.restartAppByAdbShell(deviceId,packageName,launchActivity);
    }
}