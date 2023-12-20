package com.example.productflavors

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginButton(modifier: Modifier, context: Context) {
    OutlinedButton(
        colors = ButtonDefaults.buttonColors(
           containerColor = Color(0xFFFFFFF)
        ),
        onClick = {
            Toast.makeText(context, "Loged with Google", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Huawei",
            tint = Color.Unspecified,
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Sign in with Google", fontSize = 14.sp, color = Color.Black)
    }
}