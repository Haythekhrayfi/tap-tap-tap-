package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends kc.c<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<kc.z<Object>> f32906d;

    /* JADX WARN: Multi-variable type inference failed */
    public v3(List<? extends kc.z<Object>> list) {
        this.f32906d = list;
    }

    @Override // kc.a
    public int d() {
        return this.f32906d.size();
    }

    @Override // kc.c, java.util.List
    public Object get(int i10) {
        return this.f32906d.get(i10).f32013b;
    }
}
