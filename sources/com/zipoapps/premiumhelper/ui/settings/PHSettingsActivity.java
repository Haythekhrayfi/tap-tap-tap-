package com.zipoapps.premiumhelper.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Objects;
import jc.w;
import ma.h;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public class PHSettingsActivity extends AppCompatActivity {
    public static final a Companion = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final void a(Context context, bb.b bVar, Class<?> cls) {
            Intent intent = new Intent(context, cls);
            intent.putExtras(bVar.a());
            context.startActivity(intent);
        }
    }

    public static final class b extends l implements uc.a<w> {
        public b() {
            super(0);
        }

        @Override // uc.a
        public w invoke() {
            PHSettingsActivity.this.onAccountDeleted();
            return w.f31842a;
        }
    }

    private final void applyTheme() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.settingsActivityTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 != 0) {
            setTheme(i10);
        }
    }

    private final void setupBackground() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.settingsBackground, typedValue, true);
        View viewFindViewById = findViewById(R.id.rootView);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(typedValue.resourceId);
        }
    }

    private final void setupToolbar() {
        int iIntValue;
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.toolbarTitle, typedValue, true);
        CharSequence string = typedValue.string;
        getTheme().resolveAttribute(R.attr.title, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (string == null) {
            string = charSequence;
        }
        if (string == null) {
            string = getString(R.string.app_name);
            j0.h(string, "getString(R.string.app_name)");
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.q(string);
        }
        getTheme().resolveAttribute(R.attr.toolbarBackgroundColor, typedValue, true);
        Integer numValueOf = Integer.valueOf(typedValue.data);
        if (!(numValueOf.intValue() != 0)) {
            numValueOf = null;
        }
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        Integer numValueOf2 = Integer.valueOf(typedValue.data);
        Integer num = numValueOf2.intValue() != 0 ? numValueOf2 : null;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = num != null ? num.intValue() : -16777216;
        }
        ColorDrawable colorDrawable = new ColorDrawable(iIntValue);
        androidx.appcompat.app.a supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.m(colorDrawable);
        }
    }

    public void onAccountDeleted() {
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        applyTheme();
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        bb.b bVarA = bb.b.E.a(getIntent().getExtras());
        if (bVarA == null) {
            throw new IllegalStateException("Support email and VIP email should be passed via Config".toString());
        }
        Objects.requireNonNull(h.f33410y.a().f33435x);
        j0.i(bVarA, "config");
        bb.g gVar = new bb.g();
        gVar.setArguments(bVarA.a());
        setupToolbar();
        setupBackground();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        j0.h(supportFragmentManager, "supportFragmentManager");
        b bVar = new b();
        j0.i(supportFragmentManager, "<this>");
        j0.i(this, "lifecycleOwner");
        j0.i(bVar, "action");
        supportFragmentManager.e0("REQUEST_ACCOUNT_DELETE", this, new bb.a(bVar, 0));
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getSupportFragmentManager());
        aVar.g(R.id.fragment_container, gVar);
        aVar.c();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        j0.i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
