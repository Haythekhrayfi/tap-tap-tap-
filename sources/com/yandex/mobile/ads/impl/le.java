package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class le implements dr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v61.d f22696a = new v61.d();

    public final boolean b() {
        rs rsVar = (rs) this;
        return rsVar.getPlaybackState() == 3 && rsVar.getPlayWhenReady() && rsVar.getPlaybackSuppressionReason() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean hasNextMediaItem() {
        int iA;
        rs rsVar = (rs) this;
        v61 currentTimeline = rsVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            iA = -1;
        } else {
            int currentMediaItemIndex = rsVar.getCurrentMediaItemIndex();
            rsVar.d();
            rsVar.e();
            iA = currentTimeline.a(currentMediaItemIndex, 0, false);
        }
        return iA != -1;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean hasPreviousMediaItem() {
        int iB;
        rs rsVar = (rs) this;
        v61 currentTimeline = rsVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            iB = -1;
        } else {
            int currentMediaItemIndex = rsVar.getCurrentMediaItemIndex();
            rsVar.d();
            rsVar.e();
            iB = currentTimeline.b(currentMediaItemIndex, 0, false);
        }
        return iB != -1;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean isCurrentMediaItemDynamic() {
        rs rsVar = (rs) this;
        v61 currentTimeline = rsVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(rsVar.getCurrentMediaItemIndex(), this.f22696a, 0L).f25869i;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean isCurrentMediaItemLive() {
        rs rsVar = (rs) this;
        v61 currentTimeline = rsVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(rsVar.getCurrentMediaItemIndex(), this.f22696a, 0L).a();
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean isCurrentMediaItemSeekable() {
        rs rsVar = (rs) this;
        v61 currentTimeline = rsVar.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(rsVar.getCurrentMediaItemIndex(), this.f22696a, 0L).f25868h;
    }
}
