<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Guess The Hero</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #1a1a2e 0%, #16213e 50%, #0f3460 100%);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            overflow-x: hidden;
        }

        .container {
            text-align: center;
            padding: 40px;
            max-width: 800px;
            animation: fadeIn 1s ease-in;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-30px); }
            to { opacity: 1; transform: translateY(0); }
        }

        h1 {
            color: #e94560;
            font-size: 3.5rem;
            margin-bottom: 20px;
            text-shadow: 0 0 20px rgba(233, 69, 96, 0.5);
            animation: glow 2s ease-in-out infinite alternate;
        }

        @keyframes glow {
            from { text-shadow: 0 0 20px rgba(233, 69, 96, 0.5); }
            to { text-shadow: 0 0 30px rgba(233, 69, 96, 0.8), 0 0 40px rgba(233, 69, 96, 0.4); }
        }

        .subtitle {
            color: #a0a0a0;
            font-size: 1.2rem;
            margin-bottom: 40px;
            letter-spacing: 2px;
        }

        .hero-card {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            border-radius: 20px;
            padding: 40px;
            margin: 20px 0;
            border: 1px solid rgba(255, 255, 255, 0.2);
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .hero-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 12px 40px rgba(233, 69, 96, 0.3);
        }

        .attributes {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
            gap: 20px;
            margin-top: 30px;
        }

        .attribute {
            background: linear-gradient(145deg, rgba(233, 69, 96, 0.2), rgba(15, 52, 96, 0.3));
            padding: 20px 30px;
            border-radius: 15px;
            min-width: 150px;
            border: 1px solid rgba(233, 69, 96, 0.3);
            transition: all 0.3s ease;
        }

        .attribute:hover {
            transform: scale(1.05);
            background: linear-gradient(145deg, rgba(233, 69, 96, 0.4), rgba(15, 52, 96, 0.5));
        }

        .attribute-icon {
            font-size: 2.5rem;
            margin-bottom: 10px;
        }

        .attribute-name {
            color: #e94560;
            font-size: 1.1rem;
            font-weight: bold;
            margin-bottom: 5px;
        }

        .attribute-value {
            color: #ffffff;
            font-size: 1.5rem;
            font-weight: bold;
        }

        .btn {
            background: linear-gradient(145deg, #e94560, #c73e54);
            color: white;
            border: none;
            padding: 15px 40px;
            font-size: 1.2rem;
            border-radius: 50px;
            cursor: pointer;
            margin-top: 30px;
            transition: all 0.3s ease;
            box-shadow: 0 4px 15px rgba(233, 69, 96, 0.4);
            text-transform: uppercase;
            letter-spacing: 2px;
        }

        .btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 6px 25px rgba(233, 69, 96, 0.6);
            background: linear-gradient(145deg, #ff5a75, #e94560);
        }

        .btn:active {
            transform: translateY(-1px);
        }

        .particles {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            pointer-events: none;
            overflow: hidden;
            z-index: -1;
        }

        .particle {
            position: absolute;
            width: 10px;
            height: 10px;
            background: rgba(233, 69, 96, 0.3);
            border-radius: 50%;
            animation: float 15s infinite;
        }

        @keyframes float {
            0%, 100% {
                transform: translateY(100vh) rotate(0deg);
                opacity: 0;
            }
            10% {
                opacity: 1;
            }
            90% {
                opacity: 1;
            }
            100% {
                transform: translateY(-100vh) rotate(720deg);
                opacity: 0;
            }
        }

        .footer {
            margin-top: 40px;
            color: #666;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>
    <div class="particles" id="particles"></div>
    
    <div class="container">
        <h1>🦸 Guess The Hero 🦹</h1>
        <p class="subtitle">DISCOVER YOUR SUPERHERO IDENTITY</p>
        
        <div class="hero-card">
            <h2 style="color: #fff; margin-bottom: 20px;">Test Your Abilities</h2>
            <p style="color: #ccc; line-height: 1.6;">
                Answer questions about your strengths and discover which superhero 
                matches your unique combination of agility, intelligence, and strength!
            </p>
            
            <div class="attributes">
                <div class="attribute">
                    <div class="attribute-icon">⚡</div>
                    <div class="attribute-name">Agility</div>
                    <div class="attribute-value">?</div>
                </div>
                <div class="attribute">
                    <div class="attribute-icon">🧠</div>
                    <div class="attribute-name">Intelligence</div>
                    <div class="attribute-value">?</div>
                </div>
                <div class="attribute">
                    <div class="attribute-icon">💪</div>
                    <div class="attribute-name">Strength</div>
                    <div class="attribute-value">?</div>
                </div>
            </div>
            
            <button class="btn" onclick="startQuiz()">Start Quiz</button>
        </div>
        
        <div class="footer">
            <p>Built with Apache Struts & Drools Rules Engine</p>
        </div>
    </div>

    <script>
        // Create floating particles
        function createParticles() {
            const container = document.getElementById('particles');
            for (let i = 0; i < 20; i++) {
                const particle = document.createElement('div');
                particle.className = 'particle';
                particle.style.left = Math.random() * 100 + '%';
                particle.style.animationDelay = Math.random() * 15 + 's';
                particle.style.animationDuration = (Math.random() * 10 + 10) + 's';
                container.appendChild(particle);
            }
        }

        function startQuiz() {
            // Add click animation
            event.target.style.transform = 'scale(0.95)';
            setTimeout(() => {
                event.target.style.transform = 'scale(1)';
                // Redirect to quiz or trigger action
                alert('Quiz starting soon...');
            }, 150);
        }

        // Initialize particles on load
        window.onload = createParticles;
    </script>
</body>
</html>
