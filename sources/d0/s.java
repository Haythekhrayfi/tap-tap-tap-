package d0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PendingIntent f28565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PendingIntent f28566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f28567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28571g;

    public static class a {
        public static s a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                return null;
            }
            c cVar = new c(bubbleMetadata.getIntent(), IconCompat.b(bubbleMetadata.getIcon()));
            cVar.f28576e = bubbleMetadata.getAutoExpandBubble() ? cVar.f28576e | 1 : cVar.f28576e & (-2);
            cVar.f28577f = bubbleMetadata.getDeleteIntent();
            cVar.f28576e = bubbleMetadata.isNotificationSuppressed() ? cVar.f28576e | 2 : cVar.f28576e & (-3);
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f28574c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f28575d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f28575d = bubbleMetadata.getDesiredHeightResId();
                cVar.f28574c = 0;
            }
            return cVar.a();
        }

        public static Notification.BubbleMetadata b(s sVar) {
            if (sVar == null || sVar.f28565a == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(sVar.f28567c.l()).setIntent(sVar.f28565a).setDeleteIntent(sVar.f28566b).setAutoExpandBubble((sVar.f28570f & 1) != 0).setSuppressNotification((sVar.f28570f & 2) != 0);
            int i10 = sVar.f28568d;
            if (i10 != 0) {
                suppressNotification.setDesiredHeight(i10);
            }
            int i11 = sVar.f28569e;
            if (i11 != 0) {
                suppressNotification.setDesiredHeightResId(i11);
            }
            return suppressNotification.build();
        }
    }

    public static class b {
        public static s a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.b(bubbleMetadata.getIcon()));
            cVar.f28576e = bubbleMetadata.getAutoExpandBubble() ? cVar.f28576e | 1 : cVar.f28576e & (-2);
            cVar.f28577f = bubbleMetadata.getDeleteIntent();
            cVar.f28576e = bubbleMetadata.isNotificationSuppressed() ? cVar.f28576e | 2 : cVar.f28576e & (-3);
            if (bubbleMetadata.getDesiredHeight() != 0) {
                cVar.f28574c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                cVar.f28575d = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                cVar.f28575d = bubbleMetadata.getDesiredHeightResId();
                cVar.f28574c = 0;
            }
            return cVar.a();
        }

        public static Notification.BubbleMetadata b(s sVar) {
            if (sVar == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder builder = sVar.f28571g != null ? new Notification.BubbleMetadata.Builder(sVar.f28571g) : new Notification.BubbleMetadata.Builder(sVar.f28565a, sVar.f28567c.l());
            builder.setDeleteIntent(sVar.f28566b).setAutoExpandBubble((sVar.f28570f & 1) != 0).setSuppressNotification((sVar.f28570f & 2) != 0);
            int i10 = sVar.f28568d;
            if (i10 != 0) {
                builder.setDesiredHeight(i10);
            }
            int i11 = sVar.f28569e;
            if (i11 != 0) {
                builder.setDesiredHeightResId(i11);
            }
            return builder.build();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PendingIntent f28572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f28573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PendingIntent f28577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f28578g;

        @Deprecated
        public c() {
        }

        public c(PendingIntent pendingIntent, IconCompat iconCompat) {
            Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
            Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
            this.f28572a = pendingIntent;
            this.f28573b = iconCompat;
        }

        public c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            this.f28578g = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public s a() {
            String str = this.f28578g;
            if (str == null) {
                Objects.requireNonNull(this.f28572a, "Must supply pending intent or shortcut to bubble");
            }
            if (str == null) {
                Objects.requireNonNull(this.f28573b, "Must supply an icon or shortcut for the bubble");
            }
            PendingIntent pendingIntent = this.f28572a;
            PendingIntent pendingIntent2 = this.f28577f;
            IconCompat iconCompat = this.f28573b;
            int i10 = this.f28574c;
            int i11 = this.f28575d;
            int i12 = this.f28576e;
            s sVar = new s(pendingIntent, pendingIntent2, iconCompat, i10, i11, i12, str, null);
            sVar.f28570f = i12;
            return sVar;
        }
    }

    public s(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i10, int i11, int i12, String str, o oVar) {
        this.f28565a = pendingIntent;
        this.f28567c = iconCompat;
        this.f28568d = i10;
        this.f28569e = i11;
        this.f28566b = pendingIntent2;
        this.f28570f = i12;
        this.f28571g = str;
    }
}
