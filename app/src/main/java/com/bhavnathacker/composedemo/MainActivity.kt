package com.bhavnathacker.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhavnathacker.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeDemoTheme {
        MainScreen("2021")
      }
    }
  }
}


@Composable
fun MainScreen(title: String) {
  Column {
    Row(modifier = Modifier.padding(8.dp)) {
      Image(
        painter = painterResource(id = R.drawable.devfest),
        contentDescription = "DevFest Logo",
        modifier = Modifier
          .size(48.dp)
          .clip(CircleShape)
      )

      Spacer(modifier = Modifier.width(4.dp))

      Surface(shape = MaterialTheme.shapes.small, elevation = 1.dp) {
        Text(
          text = "DevFest $title",
          color = MaterialTheme.colors.primary,
          style = MaterialTheme.typography.subtitle1
        )
      }
    }

    Button(onClick = { }) {
      Text(text = "Register")
    }

  }

}

@Preview
@Composable
fun PreviewMainScreen() {
  ComposeDemoTheme {
    MainScreen("2021")
  }
}

