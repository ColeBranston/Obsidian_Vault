1. ![[docker file]]
- Note: This is literally called "Dockerfile" for it to work 
3. ![[the basics of docker and containerization]]
4. A sample of a docker file looks like this:
```DockerFile
 #Instruction that tells docker image what language to use in the container
FROM python:3.8

#Tells the docker image to make the working directory "/app"
WORKDIR /app 

#The tells the image to add <directory> to <Imagedirectory>
ADD . /app

#Downloads all the packages to the image
RUN pip install -r ./requirements.txt

#Tells the docker image to ensure that each container run should be accessed through the following port. Makes it public
EXPOSE 5000

#Runs the following command with each space in the terminal command separated by quotations and commas
CMD ["python", "api.py"]
```

5. To create the docker image use this command:
```Terminal
C:Users/JackBranston> docker build -t <myimagenameinlowercases> .
```

6. To run the image as it would be used in the cloud use:
   
```Cmd
C:Users/JackBranston> docker run <imageName>
```