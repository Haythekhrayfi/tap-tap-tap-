package oc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends a {
    public g(mc.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == mc.h.f33539c)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // mc.d
    public mc.f getContext() {
        return mc.h.f33539c;
    }
}
