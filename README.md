# 

## Model
www.msaez.io/#/storming/ae7f0b4f2c398a33256be7051df80fdc

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- device


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- device
```
 http :8088/devices midx="midx" tenant_id="tenant_id" machine_code="machine_code" machine_name="machine_name" standard_uph="standard_uph" machine_type="machine_type" userId="userId" 
 http :8088/devices midx="midx" tenant_id="tenant_id" machine_code="machine_code" machine_name="machine_name" standard_uph="standard_uph" machine_type="machine_type" userId="userId" 
 http :8088/devices midx="midx" tenant_id="tenant_id" machine_code="machine_code" machine_name="machine_name" standard_uph="standard_uph" machine_type="machine_type" 
 http :8088/users midx="midx" regi_nm="regi_nm" regi_tm="regi_tm" 
 http :8088/users midx="midx" modi_nm="modi_nm" modi_tm="modi_tm" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

