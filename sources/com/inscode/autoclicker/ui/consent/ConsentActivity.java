package com.inscode.autoclicker.ui.consent;

import ae.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.ui.consent.ConsentActivity;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.e;
import jc.f;
import k7.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsentActivity extends BaseActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final e appSettings$delegate = f.b(new ConsentActivity$special$$inlined$inject$default$1(this, "", null, b.f348c));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ConsentActivity consentActivity, CompoundButton compoundButton, boolean z10) {
        j0.i(consentActivity, "this$0");
        consentActivity.getAppSettings().p(z10);
        consentActivity.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$1(ConsentActivity consentActivity, View view) {
        j0.i(consentActivity, "this$0");
        consentActivity.getAppSettings().p(false);
        consentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$2(ConsentActivity consentActivity, View view) {
        j0.i(consentActivity, "this$0");
        consentActivity.startActivity(new Intent(consentActivity, (Class<?>) PrepareActivity.class));
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    public final r6.e getAppSettings() {
        return (r6.e) this.appSettings$delegate.getValue();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_consent;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!getIntent().getBooleanExtra("disableBack", false) || ((CheckBox) _$_findCachedViewById(R.id.consentCheckBox)).isChecked()) {
            super.onBackPressed();
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("disableBack", false);
        Objects.requireNonNull(getAppSettings());
        Boolean bool = Boolean.FALSE;
        Object objA = g.a("accessibility_consent", bool);
        j0.h(objA, "get(ACCESSIBILITY_CONSENT, false)");
        if (((Boolean) objA).booleanValue() && !booleanExtra) {
            finish();
            startActivity(new Intent(this, (Class<?>) PrepareActivity.class));
            return;
        }
        CheckBox checkBox = (CheckBox) _$_findCachedViewById(R.id.consentCheckBox);
        Objects.requireNonNull(getAppSettings());
        Object objA2 = g.a("accessibility_consent", bool);
        j0.h(objA2, "get(ACCESSIBILITY_CONSENT, false)");
        checkBox.setChecked(((Boolean) objA2).booleanValue());
        ((CheckBox) _$_findCachedViewById(R.id.consentCheckBox)).setOnCheckedChangeListener(new h7.b(this));
        updateUi();
    }

    public final void updateUi() {
        Button button;
        View.OnClickListener onClickListener;
        final int i10 = 0;
        ((Button) _$_findCachedViewById(R.id.consentCancelButton)).setOnClickListener(new View.OnClickListener(this) { // from class: h7.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ConsentActivity f30949d;

            {
                this.f30949d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ConsentActivity.updateUi$lambda$1(this.f30949d, view);
                        break;
                    default:
                        ConsentActivity.updateUi$lambda$2(this.f30949d, view);
                        break;
                }
            }
        });
        if (((CheckBox) _$_findCachedViewById(R.id.consentCheckBox)).isChecked()) {
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setBackgroundResource(R.drawable.ad_button);
            final int i11 = 1;
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setEnabled(true);
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setClickable(true);
            button = (Button) _$_findCachedViewById(R.id.consentProceedButton);
            onClickListener = new View.OnClickListener(this) { // from class: h7.a

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ConsentActivity f30949d;

                {
                    this.f30949d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ConsentActivity.updateUi$lambda$1(this.f30949d, view);
                            break;
                        default:
                            ConsentActivity.updateUi$lambda$2(this.f30949d, view);
                            break;
                    }
                }
            };
        } else {
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setBackgroundResource(R.drawable.gray_background);
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setEnabled(false);
            ((Button) _$_findCachedViewById(R.id.consentProceedButton)).setClickable(false);
            button = (Button) _$_findCachedViewById(R.id.consentProceedButton);
            onClickListener = null;
        }
        button.setOnClickListener(onClickListener);
    }
}
