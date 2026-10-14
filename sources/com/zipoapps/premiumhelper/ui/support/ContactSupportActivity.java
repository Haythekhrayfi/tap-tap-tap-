package com.zipoapps.premiumhelper.ui.support;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.MaterialToolbar;
import com.inscode.autoclicker.R;
import ed.u;
import fd.j0;
import jc.f;
import ma.h;
import vc.g;
import vc.l;
import y6.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactSupportActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28423f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f28424c = f.b(new e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f28425d = f.b(new d());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f28426e = f.b(new b());

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public static final class b extends l implements uc.a<EditText> {
        public b() {
            super(0);
        }

        @Override // uc.a
        public EditText invoke() {
            return (EditText) ContactSupportActivity.this.findViewById(R.id.edit_text);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            CharSequence charSequenceY;
            Object value = ContactSupportActivity.this.f28425d.getValue();
            j0.h(value, "<get-sendButton>(...)");
            ((View) value).setEnabled(((charSequence == null || (charSequenceY = u.Y(charSequence)) == null) ? 0 : charSequenceY.length()) >= 20);
        }
    }

    public static final class d extends l implements uc.a<View> {
        public d() {
            super(0);
        }

        @Override // uc.a
        public View invoke() {
            return ContactSupportActivity.this.findViewById(R.id.button_send);
        }
    }

    public static final class e extends l implements uc.a<MaterialToolbar> {
        public e() {
            super(0);
        }

        @Override // uc.a
        public MaterialToolbar invoke() {
            return (MaterialToolbar) ContactSupportActivity.this.findViewById(R.id.toolbar);
        }
    }

    public final EditText g() {
        Object value = this.f28426e.getValue();
        j0.h(value, "<get-editText>(...)");
        return (EditText) value;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contact_support);
        Object value = this.f28424c.getValue();
        j0.h(value, "<get-toolbar>(...)");
        setSupportActionBar((MaterialToolbar) value);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        boolean z10 = true;
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        String stringExtra = getIntent().getStringExtra(Scopes.EMAIL);
        if (stringExtra == null) {
            throw new IllegalStateException("No email address!".toString());
        }
        String stringExtra2 = getIntent().getStringExtra("email_vip");
        if (!h.f33410y.a().i() || (stringExtra2 == null && !u.v(stringExtra, ".vip", true))) {
            z10 = false;
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.q(getString(z10 ? R.string.contact_vip_support_title : R.string.contact_support_title));
        }
        g().addTextChangedListener(new c());
        Object value2 = this.f28425d.getValue();
        j0.h(value2, "<get-sendButton>(...)");
        ((View) value2).setOnClickListener(new a1(this, stringExtra, stringExtra2));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        j0.i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onResume() {
        super.onResume();
        g().requestFocus();
    }
}
