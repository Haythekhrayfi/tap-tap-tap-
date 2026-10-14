package ue;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class s extends t<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f36448a;

    public s(t tVar) {
        this.f36448a = tVar;
    }

    @Override // ue.t
    public void a(v vVar, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f36448a.a(vVar, Array.get(obj, i10));
        }
    }
}
