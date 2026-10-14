package kd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new gd.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
