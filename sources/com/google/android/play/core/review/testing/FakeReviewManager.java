package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public class FakeReviewManager implements ReviewManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReviewInfo f12334b;

    public FakeReviewManager(Context context) {
        this.f12333a = context;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        return reviewInfo != this.f12334b ? Tasks.a((Exception) new a()) : Tasks.a((Object) null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public Task<ReviewInfo> requestReviewFlow() {
        ReviewInfo reviewInfoA = ReviewInfo.a(PendingIntent.getBroadcast(this.f12333a, 0, new Intent(), 0));
        this.f12334b = reviewInfoA;
        return Tasks.a(reviewInfoA);
    }
}
