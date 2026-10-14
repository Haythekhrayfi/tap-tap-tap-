package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import jc.w;
import mc.d;
import nc.a;
import oc.c;
import oc.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1, reason: invalid class name */
    @e(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", l = {17}, m = "requestReview")
    public static final class AnonymousClass1 extends c {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }
    }

    public static final Object launchReview(ReviewManager reviewManager, Activity activity, ReviewInfo reviewInfo, d<? super w> dVar) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        j0.e(taskLaunchReviewFlow, "launchReviewFlow(activity, reviewInfo)");
        Object objRunTask$default = TaskUtilsKt.runTask$default(taskLaunchReviewFlow, null, dVar, 2, null);
        return objRunTask$default == a.COROUTINE_SUSPENDED ? objRunTask$default : w.f31842a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestReview(ReviewManager reviewManager, d<? super ReviewInfo> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objRunTask$default = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            h9.d.t(objRunTask$default);
            Task<ReviewInfo> taskRequestReviewFlow = reviewManager.requestReviewFlow();
            j0.e(taskRequestReviewFlow, "requestReviewFlow()");
            anonymousClass1.L$0 = reviewManager;
            anonymousClass1.label = 1;
            objRunTask$default = TaskUtilsKt.runTask$default(taskRequestReviewFlow, null, anonymousClass1, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objRunTask$default);
        }
        j0.e(objRunTask$default, "runTask(requestReviewFlow())");
        return objRunTask$default;
    }
}
