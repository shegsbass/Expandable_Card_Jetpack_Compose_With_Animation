package com.shegs.expandablecardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shegs.expandablecardcompose.ui.theme.ExpandableCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardComposeTheme {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(24.dp),
                ) {
                    ExpandableCard(
                        title = "My Title",
                        description = "This are just random text going into this field and i am going to copy and paste it " +
                                "This are just random text going into this field and i am going to copy and paste it " +
                                "This are just random text going into this field and i am going to copy and paste it " +
                                "This are just random text going into this field and i am going to copy and paste it "
                    )
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExpandableCardComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ExpandableCard(
                title = "My Title",
                description = "This are just random text going into this field and i am going to copy and paste it " +
                        "This are just random text going into this field and i am going to copy and paste it " +
                        "This are just random text going into this field and i am going to copy and paste it " +
                        "This are just random text going into this field and i am going to copy and paste it "
            )
        }

    }
}