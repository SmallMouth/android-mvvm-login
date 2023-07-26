package com.limouth.mvvm_login.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.limouth.mvvm_login.R


@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ), color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ), color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
}

@Composable
fun MyTextFieldComponent(
    labelValue: String
) {

    var textValue = remember {
        mutableStateOf("").value
    }

    OutlinedTextField(value = textValue,
        onValueChange = { textValue = it })
//    OutlinedTextField(
//        value = textValue,
//        onValueChange = { textValue = it },
//        label = { Text(text = "Model URL") },
//        maxLines = 3,
//        modifier = Modifier.fillMaxWidth()
//    )
//    OutlinedTextField(
//        value = textValue,
//        onValueChange = { textValue = it },
//        label = { Text("Label") }
//    )

//    OutlinedTextField(
//        value = textValue,
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            focusedBorderColor = Primary,
//            focusedLabelColor = Primary,
//            cursorColor = Primary
//        ),
//        keyboardOptions = KeyboardOptions.Default,
//        onValueChange = { textValue.value = it }
//    )
}