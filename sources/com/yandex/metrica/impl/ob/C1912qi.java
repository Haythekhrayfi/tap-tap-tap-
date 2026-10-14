package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1912qi implements InterfaceC2116yi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IIdentifierCallback f17184b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<IIdentifierCallback> f17185a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qi$a */
    public class a implements IIdentifierCallback {
        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C1912qi(IIdentifierCallback iIdentifierCallback) {
        this.f17185a = new AtomicReference<>(iIdentifierCallback);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2116yi
    public void a(IParamsCallback.Reason reason, Map<String, C1646g1> map) {
        IIdentifierCallback.Reason reason2;
        IIdentifierCallback andSet = this.f17185a.getAndSet(f17184b);
        int iOrdinal = reason.ordinal();
        if (iOrdinal != 1) {
            reason2 = iOrdinal != 2 ? IIdentifierCallback.Reason.UNKNOWN : IIdentifierCallback.Reason.INVALID_RESPONSE;
        } else {
            reason2 = IIdentifierCallback.Reason.NETWORK;
        }
        andSet.onRequestError(reason2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2116yi
    public void onReceive(Map<String, C1646g1> map) {
        IIdentifierCallback andSet = this.f17185a.getAndSet(f17184b);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, C1646g1> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().f16160a);
        }
        andSet.onReceive(map2);
    }
}
