package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final y logger;
    private final o sdk;

    public ArrayDataCollector(o oVar) {
        this.sdk = oVar;
        this.logger = oVar.F();
    }

    public long collectAppHubVersionCode(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (!y.a()) {
                return -1L;
            }
            this.logger.b(TAG, "Failed to collect version code", th);
            return -1L;
        }
    }

    public Boolean collectDirectDownloadEnabled(IAppHubService iAppHubService) {
        try {
            return Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (Throwable th) {
            if (!y.a()) {
                return null;
            }
            this.logger.b(TAG, "Failed to collect enabled features", th);
            return null;
        }
    }

    public String collectRandomUserToken(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (!y.a()) {
                return null;
            }
            this.logger.b(TAG, "Failed to collect random user token", th);
            return null;
        }
    }
}
