package com.alexaleluia12.quadrados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexaleluia12.quadrados.ui.theme.QuadradosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadradosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SolutionSquare()
                }
            }
        }
    }
}


@Composable
fun Square(header: String, body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = body, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun SolutionSquarePreview() {
    QuadradosTheme {
        SolutionSquare()
    }
}


@Composable
fun SolutionSquare() {

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Square(
                header = stringResource(R.string.header_sq1),
                body = stringResource(R.string.body_sq1),
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .weight(1f)
            )
            Square(
                header = stringResource(R.string.header_sq2),
                body = stringResource(R.string.body_sq2),
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Square(
                header = stringResource(R.string.header_sq3),
                body = stringResource(R.string.body_sq3),
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .weight(1f)
            )
            Square(
                header = stringResource(R.string.header_sq4),
                body = stringResource(R.string.body_sq4),
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .weight(1f)
            )
        }
    }

}


