package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ReviewManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f12322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f12323b = new Handler(Looper.getMainLooper());

    public c(h hVar) {
        this.f12322a = hVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        i iVar = new i();
        intent.putExtra("result_receiver", new b(this.f12323b, iVar));
        activity.startActivity(intent);
        return iVar.a();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.f12322a.a();
    }
}
