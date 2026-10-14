package y6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends vc.l implements uc.l<List<String>, me.a<? extends List<? extends v6.a>>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar) {
        super(1);
        this.f38416c = sVar;
    }

    @Override // uc.l
    public me.a<? extends List<? extends v6.a>> invoke(List<String> list) {
        fd.j0.i(list, "it");
        return this.f38416c.f38378b.a().o();
    }
}
