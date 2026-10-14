package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.a f38279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(RecordSettingsLoadActivity recordSettingsLoadActivity, v6.a aVar) {
        super(1);
        this.f38278c = recordSettingsLoadActivity;
        this.f38279d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        this.f38278c.f13180f.remove(this.f38279d);
        return jc.w.f31842a;
    }
}
