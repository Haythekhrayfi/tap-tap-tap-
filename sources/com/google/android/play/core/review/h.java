package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.appupdate.z;
import com.google.android.play.core.internal.ab;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final af f12330b = new af("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap<ab> f12331a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12332c;

    public h(Context context) {
        this.f12332c = context.getPackageName();
        this.f12331a = new ap<>(context, f12330b, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), d.f12324a);
    }

    public final Task<ReviewInfo> a() {
        i iVarA = z.a(f12330b, "requestInAppReview (%s)", new Object[]{this.f12332c});
        this.f12331a.a(new e(this, iVarA, iVarA));
        return iVarA.a();
    }
}
