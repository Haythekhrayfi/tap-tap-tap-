package com.applovin.impl.mediation.debugger.ui.e;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9768b;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f9768b);
        intent.putExtra("android.intent.extra.TITLE", "IABTCF_TCString");
        intent.putExtra("android.intent.extra.SUBJECT", "IABTCF_TCString");
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9767a;
    }

    public void initialize(o oVar) {
        this.f9767a = oVar;
        this.f9768b = oVar.ab().d();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle("IABTCF_TCString");
        ((TextView) findViewById(R.id.textView)).setText(this.f9768b);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
