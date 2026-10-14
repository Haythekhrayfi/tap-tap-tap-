package okhttp3.internal.http2;

import fd.j0;
import java.io.IOException;
import java.util.List;
import qd.f;

/* JADX INFO: loaded from: classes3.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, f fVar, int i11, boolean z10) throws IOException {
                j0.i(fVar, "source");
                fVar.skip(i11);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, List<Header> list, boolean z10) {
                j0.i(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, List<Header> list) {
                j0.i(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i10, ErrorCode errorCode) {
                j0.i(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, f fVar, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<Header> list, boolean z10);

    boolean onRequest(int i10, List<Header> list);

    void onReset(int i10, ErrorCode errorCode);
}
