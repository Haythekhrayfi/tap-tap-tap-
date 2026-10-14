package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import ch.qos.logback.classic.Level;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class HandlerC0771Ax extends Handler {
    public static String[] A01 = {"19chgsqBzMImuF0gwnX2kWBGh", "0va0RllBKLagHwkqX9d70BpModZgILa7", "XpojMROpw9tVkn", "wcizW", "UvDBMI562EynJYmanZ8wO6TzDmvB3zda", "jZLpPncA8U18qC4rrohpR2MIc", "dSPbX", "wnd1v8XwPzGQd7q91R22pRoLt2u"};
    public final /* synthetic */ C1312Wx A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A01(Message message) {
        int i10;
        if (!(message.arg1 == 1) || (i10 = message.arg2 + 1) > this.A00.A0D) {
            return false;
        }
        Message messageObtain = Message.obtain(message);
        messageObtain.arg2 = i10;
        sendMessageDelayed(messageObtain, A00(i10));
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                switch (message.what) {
                    case 0:
                        e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (BO) obj);
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (BK) pair.first, (String) pair.second);
                        break;
                    default:
                        throw new RuntimeException();
                }
            } catch (Exception e10) {
                e = e10;
                if (A01(message)) {
                    return;
                }
                String[] strArr = A01;
                if (strArr[1].charAt(1) != strArr[4].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "iOxYX";
                strArr2[7] = "16FbQS5YLOa2TifOFD04FKBpDBi";
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ax != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0771Ax(C1312Wx c1312Wx, Looper looper) {
        super(looper);
        this.A00 = c1312Wx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ax != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i10) {
        return Math.min((i10 - 1) * 1000, Level.TRACE_INT);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ax != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i10, Object obj, boolean z10) {
        obtainMessage(i10, z10 ? 1 : 0, 0, obj).sendToTarget();
    }
}
