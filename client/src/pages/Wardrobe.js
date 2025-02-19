import { Canvas, useFrame } from "@react-three/fiber";
import { useGLTF } from "@react-three/drei";
import { useEffect, useRef, useState } from "react";
import { AnimationMixer, LoopOnce, BoxGeometry } from "three";
import { useNavigate } from "react-router-dom";

function ClickablePoint({ position, width, height, depth, onClick, setHoveredName, animationName, scene}) {
  const boxRef = useRef();
  const [hovered, setHovered] = useState(false);
  const meshRef = useRef(null);

  useEffect(() => {
    
    if (boxRef.current) {
      boxRef.current.geometry = new BoxGeometry(width, height, depth);
    }

    scene.traverse((object) => {
      if (object !== undefined && object.name === animationName) {
        meshRef.current = object;
        if (meshRef.current.material) {
          meshRef.current.material = meshRef.current.material.clone();
        }
      }
    });
  }, [scene]);

  return (
    <mesh
      ref={boxRef}
      position={position}
      onClick={onClick}
      onPointerOver={() => {
          setHovered(true);
          setHoveredName(animationName);
          if(meshRef.current) {
            meshRef.current.material.color.set("red");
          }
        }
      }
      onPointerOut={() => {
        setHoveredName(null)
        setHovered(false);
        if(meshRef.current) {
          meshRef.current.material.color.set("white");
        }
      }}
    >
      <meshStandardMaterial 
        visible={false}
      />
    </mesh>
  );
}

function AnimatedScene({ camera, setHoveredName }) {
  const { scene, animations } = useGLTF("/animations.glb");
  const mixerRef = useRef(new AnimationMixer(scene));
  const [isPlaying, setIsPlaying] = useState(false);
  const navigate = useNavigate();

  const initialCameraPosition = useRef(camera.position.clone());
  const initialCameraRotation = useRef(camera.rotation.clone());

  const shirtAnimation = animations.find((anim) => anim.name === "ShirtsAnimation");
  const suitAnimation = animations.find((anim) => anim.name === "SuitsAnimation");
  const jacketAnimation = animations.find((anim) => anim.name === "JacketsAnimation");
  const tshirtAnimation = animations.find((anim) => anim.name === "T-shirtsAnimation");
  const shoesAnimation = animations.find((anim) => anim.name === "ShoesAnimation");
  const hoodieAnimation = animations.find((anim) => anim.name === "SweatshirtsAnimation");
  const pantsAnimation = animations.find((anim) => anim.name === "PantsAnimation");
  const bagAnimation = animations.find((anim) => anim.name === "BagsAnimation");
  const jewelryAnimation = animations.find((anim) => anim.name === "JewelleryAnimation");
  const perfumeAnimation = animations.find((anim) => anim.name === "PerfumesAnimation");
  const accessoriesAnimation = animations.find((anim) => anim.name === "AccessoriesAnimation");
 
  useEffect(() => {
    scene.traverse((object) => {
      if (object.type === "PointLight") {
        object.intensity = 10;
      }
    });
  }, [scene]);

  const playAnimationAndNavigate = (animation) => {
    if (!animation || isPlaying) return;

    setIsPlaying(true);
    const action = mixerRef.current.clipAction(animation);
    action.setLoop(LoopOnce);
    action.play();

    const animationName = animation.name.replace("Animation", "");
    action.getMixer().addEventListener("finished", () => {
      navigate(`./${animationName.toLowerCase()}`);
    });

    camera.position.copy(initialCameraPosition.current);
    camera.rotation.copy(initialCameraRotation.current);
  };

  useFrame((_, delta) => {
    if (mixerRef.current) {
      mixerRef.current.update(delta);
    }
  });

  const points = [
    {position: [2.1, 1.6, -0.5], width: 0.25, height: 0.6, depth: 0.6, animation: shirtAnimation},
    {position: [0.35, 1.6, -0.525], width: 0.25, height: 0.5, depth: 0.5, animation: tshirtAnimation},
    {position: [0.3, 1.55, -1.55], width: 0.35, height: 0.6, depth: 0.3, animation: pantsAnimation},
    {position: [0.425, 1.5, -2.525], width: 0.175, height: 0.65, depth: 0.8, animation: hoodieAnimation},
    {position: [2, 1.45, -2.575], width: 0.15, height: 1.25, depth: 0.5, animation: jacketAnimation},
    {position: [2.1, 1.5, -1.4], width: 0.36, height: 0.75, depth: 0.6, animation: suitAnimation},
    {position: [0.45, 1.0, -0.45], width: 0.2, height: 0.1, depth: 0.4, animation: jewelryAnimation},
    {position: [0.35, 1.0, -1.525], width: 0.2, height: 0.3, depth: 0.1, animation: perfumeAnimation},
    {position: [0.4, 1.0, -2.525], width: 0.25, height: 0.2, depth: 0.8, animation: accessoriesAnimation},
    {position: [0.45, 0.25, -0.475], width: 0.3, height: 0.15, depth: 0.3, animation: shoesAnimation},
    {position: [0.425, 0.35, -2.375], width: 0.35, height: 0.375, depth: 0.3, animation: bagAnimation},
  ]

  return (
    <group>
      <primitive object={scene} scale={1} position={[0, 0, 0]} />
      {points.map((point, index) => (
        <ClickablePoint
          key={index}
          position={point.position}
          width={point.width}
          height={point.height}
          depth={point.depth}
          onClick={() => playAnimationAndNavigate(point.animation)}
          setHoveredName={setHoveredName}
          animationName={point.animation.name.replace("Animation", "")}
          scene={scene}
        />
      ))}
    </group>
  );
  
}

export default function Wardrobe() {
  const { cameras } = useGLTF("/animations.glb");
  const camera = cameras[0];
  const [hoveredName, setHoveredName] = useState(null);

  return (
    <div
      style={{
        width: "80vw",
        height: "80vh",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        position: "fixed",
        top: "50%",
        left: "50%",
        transform: "translate(-50%, -50%)",
        background: "rgba(255, 255, 255, 0.1)",
      }}
    >
      <div
        style={{
          position: "absolute",
          top: "10px",
          left: "50%",
          transform: "translateX(-50%)",
          color: "white",
          fontSize: "20px",
          fontWeight: "bold",
          backgroundColor: "rgba(0, 0, 0, 0.5)",
          padding: "5px 10px",
          borderRadius: "5px",
          display: hoveredName ? "block" : "none",
        }}
      >
        {hoveredName}
      </div>
      <Canvas camera={camera}>
        <AnimatedScene camera={camera} setHoveredName={setHoveredName}/>
      </Canvas>
    </div>
  );
}
