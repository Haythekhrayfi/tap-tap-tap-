package com.zipoapps.premiumhelper.ui.settings.secret;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.inscode.autoclicker.R;
import e2.g;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class PhSecretSettingsActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28398d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f28399c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_secret_settings, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i10 = R.id.tvPhVersion;
        TextView textView = (TextView) u1.a.g(viewInflate, R.id.tvPhVersion);
        if (textView != null) {
            i10 = R.id.tvPhVersionTitle;
            TextView textView2 = (TextView) u1.a.g(viewInflate, R.id.tvPhVersionTitle);
            if (textView2 != null) {
                this.f28399c = new g(constraintLayout, constraintLayout, textView, textView2);
                setContentView(constraintLayout);
                g gVar = this.f28399c;
                if (gVar != null) {
                    ((TextView) gVar.f28995c).setText("4.4.2-alpha5");
                    return;
                } else {
                    j0.r("binding");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
