<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  
</head>

<body>

<div align="center">

  <h1>🐳 Docker Practice Lab</h1>
  <h3><em>Engineering Portability • Mastering Orchestration • Architecting Systems</em></h3>

  <p>
    <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />
    <img src="https://img.shields.io/badge/Status-In%20Progress-green?style=for-the-badge" />
  </p>

  <hr />

  <p>
    <a href="https://github.com/your-username/Docker-Practice">🚀 Explore Labs</a> •
    <a href="#key-concepts">📝 Documentation</a> •
    <a href="#author">📬 Contact</a>
  </p>

</div>

<hr />

<h2>🏛️ Project Architecture</h2>

<p>
  This repository is organized into specialized modules designed to test and master
  specific Docker capabilities through hands-on experimentation.
</p>

<table border="1" cellpadding="8" cellspacing="0">
  <tr>
    <th align="left">Module</th>
    <th align="left">Focus Area</th>
    <th align="left">Key Tooling</th>
  </tr>
  <tr>
    <td>🔗 Bind Mounts</td>
    <td>Live-syncing development environments</td>
    <td><code>volumes: - .:/app</code></td>
  </tr>
  <tr>
    <td>📡 Inter-Container</td>
    <td>Backend-to-backend REST communication</td>
    <td>Docker Bridge Network</td>
  </tr>
  <tr>
    <td>☕ Java Microservices</td>
    <td>Compiling and running JVM applications</td>
    <td><code>openjdk:17-slim</code></td>
  </tr>
  <tr>
    <td>🌐 Web Applications</td>
    <td>Port mapping and browser access</td>
    <td><code>8080:80</code></td>
  </tr>
</table>

<hr />

<h2>🛠️ The Interactive Lab Guide</h2>

<h3>📂 Explore the File System</h3>

<details>
  <summary><b>Click to expand folder hierarchy</b></summary>

  <pre>
Docker-Practice/
├── Docker Bind Mount/          # Demonstrates bind mounts & volumes
├── dockerFrom_to_container/   # Container-to-container logic
├── Java/                      # Java app containerization
└── WEBAPP/                    # Web application examples
  </pre>
</details>

<hr />

<h3>📡 Networking Deep-Dive</h3>

<p>
  One of the key breakthroughs in this lab was moving away from <code>localhost</code>
  and mastering Docker’s internal DNS-based networking.
</p>

<blockquote>
  <strong>Key Insight:</strong><br/>
  Containers on the same user-defined bridge network can communicate with each other
  using their <strong>container name</strong> as the hostname.
</blockquote>

<hr />

<h3>🧠 The Learning Log</h3>

<h4>1. Optimized Build Patterns</h4>
<p>
  A “Lean Image” philosophy is followed to keep builds efficient, secure, and production-ready.
</p>

<pre>
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN javac App.java
CMD ["java", "App"]
</pre>

<h4>2. Multi-Service Orchestration</h4>
<p>
  Docker Compose is used to manage multi-container environments without excessive
  command-line complexity.
</p>

<details>
  <summary><b>View Sample Docker Compose Logic</b></summary>

  <pre>
services:
  web:
    build: ./WEBAPP
    ports:
      - "80:80"

  api:
    build: ./Java
    networks:
      - backend

networks:
  backend:
    driver: bridge
  </pre>
</details>

<hr />

<h2 id="key-concepts">🚀 Skills Mastery Dashboard</h2>

<ul>
  <li>✅ Layer Caching – Optimizing Dockerfile instruction order</li>
  <li>✅ Container Lifecycle – Managing ephemeral vs persistent containers</li>
  <li>✅ Service Discovery – Internal communication via Docker DNS</li>
  <li>⬜ Multi-stage builds for production-grade images</li>
  <li>⬜ Persistent database volumes (PostgreSQL / Redis)</li>
</ul>

<hr />

<h2 id="author">👤 Author</h2>

<div align="center">
  <p>
    <strong>Suryansh Soni</strong><br/>
    Backend Engineer & Docker Practitioner
  </p>

  <p>
    <em>"Building, breaking, and fixing—one container at a time."</em>
  </p>
</div>

<hr />


</body>
</html>
