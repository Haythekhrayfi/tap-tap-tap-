package j7;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import se.c;
import se.h;
import se.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f31714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31715d;

    public b(Context context, String str) {
        this.f31714c = context;
        this.f31715d = str;
    }

    @Override // se.h
    public void a() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.f31714c.getAssets().open(this.f31715d);
                c cVar = new c(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                i.d(cVar);
            } catch (IOException e10) {
                throw new IllegalStateException(this.f31715d + " missing from assets", e10);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
