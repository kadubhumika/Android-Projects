package com.example.rockpaperscissor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rockpaperscissor.ui.theme.RockPaperScissorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GameScreen()
                }
            }
        }
    }
    @Composable
    fun GameScreen() {
        val choices = listOf("Rock", "Paper", "Scissor")
        var playerChoice by remember { mutableStateOf("") }
        var computerChoice by remember { mutableStateOf("") }
        var result by remember { mutableStateOf("") }

        fun determineWinner(player: String, computer: String): String {
            return when {
                player == computer -> "It's a Tie!"
                (player == "Rock" && computer == "Scissor") ||
                        (player == "Paper" && computer == "Rock") ||
                        (player == "Scissor" && computer == "Paper") -> "Player Wins!"
                else -> "Computer Wins!"
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Rock Paper Scissors!", fontSize = 28.sp)
            Spacer(modifier = Modifier.height(32.dp))

            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                choices.forEach { choice ->
                    Button(
                        onClick = {
                            playerChoice = choice
                            computerChoice = choices.random()
                            result = determineWinner(playerChoice, computerChoice)
                        },
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Text(text = choice)
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            if (playerChoice.isNotEmpty()) {
                Text("You chose: $playerChoice", fontSize = 50.sp)
                Text("Computer chose: $computerChoice", fontSize = 50.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text(result, fontSize = 50.sp)
            }
        }
    }

}

