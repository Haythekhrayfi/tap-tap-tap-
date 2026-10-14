package w7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f<Long> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q8.e eVar, u7.f fVar) {
        super(eVar, fVar);
        j0.i(eVar, "errorCollectors");
        j0.i(fVar, "expressionsRuntimeProvider");
    }

    @Override // w7.f
    public String b(Long l10) {
        return String.valueOf(l10.longValue());
    }
}
