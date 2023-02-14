# Activity-Service
Activity-Service is a Java microservice for tracking 
activities for users.  The API provides full CRUD operations, 
and the data is persisted to an H2 database.

## Installation
Docker needs to be installed, and the installation steps can vary
based on the Operating System.

* [windows](https://docs.docker.com/desktop/install/windows-install/)
* [linux](https://docs.docker.com/desktop/install/linux-install/)
* [mac](https://docs.docker.com/desktop/install/mac-install/)

## Usage
Push the code into a docker container and Build the code using Maven.  

### Build the image
```bash
docker build -t activity-service .
```

### Verify the image was built
```bash
docker image
```

### Run the container on port 9090 in detached mode
```bash
docker run -p 9090:8080 --rm -it -d --name activity-service activity-service:latest
```

### Verify the container is running
```bash
docker ps
```

### View container logs for debugging
```bash
docker logs -f activity-service
```

Refer to the [documentation](https://docs.docker.com/get-started/docker_cheatsheet.pdf) as reference to other common docker commands.

## Contributing
Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
