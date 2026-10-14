package com.inscode.autoclicker.ui.main;

import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity$manager$2 extends l implements uc.a<ReviewManager> {
    public final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$manager$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uc.a
    public final ReviewManager invoke() {
        return ReviewManagerFactory.create(this.this$0);
    }
}
