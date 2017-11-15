package com.game.show.mark2048;

import java.util.List;

/**
 * 已授权、未授权的接口回调
 * Created by Mark on 2017/9/22.
 */

public interface PermissionListener {
    void onGranted();//已授权

    void onDenied(List<String> deniedPermission);//未授权
}
